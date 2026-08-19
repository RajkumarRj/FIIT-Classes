package com.example.upload;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Filecontroller {

    @Value("${file.upload-dir}")
    private String uploadpath;


    @Value("${password}")
    private String Password ;

    @GetMapping("/")
    public String sayhello(){
        return Password;  
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file){
        
        try {

            Path directorPath = Paths.get(uploadpath);

            if(!Files.exists(directorPath)){
                Files.createDirectories(directorPath);
            }

            Path filepath = directorPath.resolve(file.getOriginalFilename());
            System.out.println(filepath);

            Files.copy(file.getInputStream() , filepath ,   StandardCopyOption.REPLACE_EXISTING);

            return "File uploaded successfully " + file.getOriginalFilename() ;
            
        } catch (Exception e) {

            e.printStackTrace();
            return "File not uploaded" + e.getMessage();
          
        }
    }


    @PostMapping("/upload-multiple")
    public ResponseEntity<String> uploadMultiple(@RequestParam("files")  MultipartFile[] files){

        List<String> uploadFileNames = new ArrayList<>();

        try {
            
            Path directoryPath = Paths.get(uploadpath);


            if(!Files.exists(directoryPath)){
                Files.createDirectories(directoryPath);
            }

            // looping 
            for(MultipartFile file: files){
                
                if(file.isEmpty()){
                    continue;
                }

                Path filepath = directoryPath.resolve(file.getOriginalFilename());

                Files.copy(file.getInputStream(), filepath, StandardCopyOption.REPLACE_EXISTING);

                uploadFileNames.add(file.getOriginalFilename());
            }
            return ResponseEntity.ok("File uploaded successfully" + uploadFileNames);

        } catch (Exception e) {
            e.printStackTrace();
           
            
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Upload failed"+e.getMessage());
        }
    }
    
}
