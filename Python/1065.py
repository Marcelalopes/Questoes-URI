#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 15:36:20 2019

@author: marcela
"""
n = 5
par = 0
while n:
    x = int(input())
    if(x%2 == 0):
        par+=1
    n-=1

if(par != 1):
    print("{} valores pares".format(par))
else:
    print("{} valor par".format(par))