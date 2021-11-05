#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 16:08:52 2019

@author: marcela
"""

x = int(input())
aux = 0
while True:
    if(x % 2 != 0):
        aux+=1
        print(x)
    if(aux == 6):
        break
    x+=1


