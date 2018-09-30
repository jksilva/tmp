# -*- coding: utf-8 -*-
"""
Created on Fri Apr 27 15:19:55 2018

@author: JK
"""
from PIL import Image
im = Image.open('mapapb.jpg', 'r')


width, height = im.size
pixel_values = list(im.getdata())

import numpy as np
myarray = np.asarray(pixel_values)