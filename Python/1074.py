#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 17:05:05 2019

@author: marcela
"""

n = int(input())
while n:
    x = int(input())
    if (x > 0 and x%2 == 0):
        print("EVEN POSITIVE")
    elif(x < 0 and x%2 == 0):
        print("EVEN NEGATIVE")
    elif(x > 0 and x%2 != 0):
        print("ODD POSITIVE")
    elif(x < 0 and x%2 != 0):
        print("ODD NEGATIVE")
    else:
        print("NULL")
    n-=1