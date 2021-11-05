#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 16:56:16 2019

@author: marcela
"""

n = int(input())
i = 1
while (i <= n):
    if(i%2 == 0):
        print("{}^2 = {}".format(i,i**2))
    i+=1