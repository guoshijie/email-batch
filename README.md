#spring-boot-base

##这是一个基于spring-boot1.3.1.RELEASE和mybatis3和项目基础框架,用于快速搭建项目

>- **IDE:** IntelliJ IDEA 15.0.1
>- **Server:** Apache Tomcat 9.0.0.1M1
>- **DATABASE:** Mysql 5.6.7
>- **Author:** Steven Guo

##注意事项
####下载项目后用Gradle构建项目
```
cd spring-boot-base
gradle build
```

##请求示例

```
http://localhost:8080/user/getUser?userId=5
```


##解决.gitignore无效问题
```
git rm --cached filename
```