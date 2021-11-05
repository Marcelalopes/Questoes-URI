#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 16:43:41 2019

@author: marcela
"""

n = int(input())
a = 0
b = 0
while n:
    x = int(input())
    if (x>= 10 and x <= 20):
        a +=1
    else:
        b += 1
    n-=1
    
print("{} in".format(a))
print("{} out".format(b))