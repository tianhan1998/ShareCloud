package cn.th.sharecloud.exception;

import cn.th.sharecloud.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestControllerAdvice(basePackages = "cn.th.sharecloud.controller")
public class GlobalExceptionControllerAdvice {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class, BindException.class})
    public Result<Object> handleValidException(Exception e){
        Result<Object> result=Result.exceptionResult("");
        List<String> msg=new ArrayList<>();
        if(e instanceof MethodArgumentNotValidException){
            if(((MethodArgumentNotValidException) e).getErrorCount()>0) {
                ((MethodArgumentNotValidException) e).getFieldErrors().forEach(fieldError -> msg.add(fieldError.getDefaultMessage()));
            }
        }else if(e instanceof BindException) {
            if (((BindException) e).getErrorCount() > 0) {
                ((BindException) e).getFieldErrors().forEach(fieldError -> msg.add(fieldError.getDefaultMessage()));
            }
        }
        result.setMsg(msg);
        return result;
    }
    @ExceptionHandler(value = {Exception.class})
    public void printStack(Exception e){
        e.printStackTrace();
    }
}
