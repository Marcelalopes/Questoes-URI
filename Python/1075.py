#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 22:35:15 2019

@author: marcela
"""

n = int(input())
i = 1
while(i<=10000):
    if(i%n == 2):
        print(i)
    i += 1