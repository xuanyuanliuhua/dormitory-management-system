@echo off
chcp 65001 >nul
echo 正在启动校园宿舍管理系统...

REM 启动后端服务 (SpringBoot)
echo 启动后端服务...
cd /d "D:\临时\50.SpringBoot+Vue3校园宿舍管理系统(优质版)\50.SpringBoot+Vue3校园宿舍管理系统(优质版)\项目源码\server"
start "后端服务" cmd /k "mvn spring-boot:run"

timeout /t 5 /nobreak >nul

REM 启动前端服务 (Vue3)
echo 启动前端服务...
cd /d "D:\临时\50.SpringBoot+Vue3校园宿舍管理系统(优质版)\50.SpringBoot+Vue3校园宿舍管理系统(优质版)\项目源码\client"
start "前端服务" cmd /k "npm run serve"

echo 服务启动完成！
echo 后端服务: http://localhost:8080
echo 前端服务: http://localhost:8081
pause