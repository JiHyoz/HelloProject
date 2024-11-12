#!/bin/bash

function printLog() {
       local str_type="$1"
    local str="$2"
    local result="$3"
    local current_time="$(date '+%Y-%m-%d %H:%M:%S')"
 
    printf "${current_time} [${str_type}] %-50s ${result}\n" "${str}"
}