package cn.th.sharecloud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Sakura
 * @since 2021-08-19
 */
@RestController
@RequestMapping("/file")
public class FileController {

//
//    @RequestMapping(value = "/UploadFile",method = RequestMethod.POST)
//    public Result<Object> uploadFiles(MultipartFile[] files, Model m, HttpServletRequest req, String path) throws IOException {
//        Result<Object> result = null;
//        int i=0;//上传成功数
//        int j=0;//上传失败数
//        for(MultipartFile file:files) {
//            if (uploadFile(file, req, m, path)) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//        if(i!=0) {
//            result=successResult("上传"+i+"个文件成功");
//        }
//        if(j!=0){
//            result= failResult("上传"+j+"个文件失败");
//        }
//        if(i==0&&j==0){
//            result=failResult("文件上传失败");
//        }
//        return result;
//    }
//    @Transactional
//    public boolean uploadFile(MultipartFile file, HttpServletRequest request, Model m,String path) throws IOException {
//        if(!file.isEmpty()) {//判断文件是否存在
//            String username = (String) request.getSession().getAttribute("username");
//            String fakefilename = file.getOriginalFilename();//不带+序号判断的假名字
//            StringBuilder newPath = null;
//            if(System.getProperty("os.name").contains("Windows")) {
//                String[] split = path.split("\\\\");
//                newPath = new StringBuilder();
//                if (split[0].equals("C:") && split[1].equals("upload")) {//处理路径字符串
//                    split[2] = username;
//                    for (String tPath : split) {
//                        newPath.append(tPath).append(File.separator);
//                    }
//                } else {
//                    return false;
//                }
//            }else if(System.getProperty("os.name").contains("Linux")){
//                String[] split = path.split("/");
//                newPath= new StringBuilder("/");
//                if(split[1].equals("home")&&split[2].equals("upload")){//处理路径字符串
//                    split[3]=username;
//                    for(String tPath:split){
//                        newPath.append(tPath).append(File.separator);
//                    }
//                }else{
//                    return false;
//                }
//            }
//            MyFile myFile = new MyFile();
//            myFile.setUsername(username);
//            myFile.setSize(String.valueOf(file.getSize()));
//            myFile.setFakename(fakefilename);
//            fileService.uploadFile(myFile);
//            String truefilename = myFile.getId() + "+" + fakefilename;//带+序号的实际文件名
//            myFile.setPath(newPath + truefilename);
//            myFile.setFilename(truefilename);
//            fileService.updateFile(myFile);
//            File uploadfile = new File(String.valueOf(newPath), myFile.getFilename());
//            if (!uploadfile.exists()) {
//                uploadfile.mkdirs();
//            }
//            try {
//                file.transferTo(uploadfile);
//            }catch(Exception e){
//                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动回滚
//                return false;
//            }
//        }else{
//            return false;
//        }
//        return true;
//    }

}
