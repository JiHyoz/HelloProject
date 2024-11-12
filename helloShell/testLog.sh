#!/bin/bash


###############################################
# Function to print log
# Date: 06/17/2024
# Author: zhushouzheng
# Reference：https://blog.csdn.net/m0_61066945/article/details/135130213
# Description:日志打印框架
# Usage:
#       printLog "INFO" "Hello ${name}" "Success"
###############################################

function printLog() {
       local str_type="$1"
    local str="$2"
    local result="$3"
    local current_time="$(date '+%Y-%m-%d %H:%M:%S')"
 
    printf "${current_time} [${str_type}] %-50s ${result}\n" "${str}"
}


echo "Enter your name"
read name
if [ $name == "zsz" ];thendwd
    printLog "INFO" "Hello ${name}" "Success"
else
    printLog "ERROR" "Hello ${name}" "Failed"
fi
