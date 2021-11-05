#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct 31 20:55:58 2019

@author: marcela
"""
cont = 0
for i in range(6):
    x =float(input())
    if x > 0:
        cont +=1
print("{} valores positivos".format(cont))

