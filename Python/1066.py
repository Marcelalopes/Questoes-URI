#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 15:51:22 2019

@author: marcela
"""

n = 5
par = 0
impar = 0
p = 0
neg = 0
while n:
    x = int(input())
    if (x%2 == 0):
        par +=1
    else:
        impar += 1
    if(x>0):
        p +=1
    elif(x < 0):
        neg += 1    
    n-=1
    
print("{} valor(es) par(es)".format(par))
print("{} valor(es) impar(es)".format(impar))
print("{} valor(es) positivo(s)".format(p))
print("{} valor(es) negativo(s)".format(neg))