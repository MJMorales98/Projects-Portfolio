import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

df = pd.read_csv('1.0_month.csv', usecols = ['mag', 'depth', 'locationSource'])

## You can use 'between' on the column numerical value and not on whole dataframe ##
## Creating variables for column data in specified ranges, not important for graph ##
quake_loc = df[df["locationSource"] == 'tx']

m_low = 0
m_high = 7.0
quake_mag = df[df["mag"].between(m_low, m_high)]

d_low = 0
d_high = 700
quake_dep = df[df["depth"].between(d_low, d_high)]

## Extracting values from columns and storing in an array##
depArray = df['depth'].values
magArray = df['mag'].values

## Sorting values from least to greatest ##
depArray.sort()
magArray.sort()

## Plotting data ##
x = magArray
y = depArray

fig, ax = plt.subplots()

ax.plot(x, y, 'r+')
ax.set_title("Magnitude and Depth of EarthQuakes in Texas over a one month period")
ax.set_xlabel("Magnitude of EarthQuakes")
ax.set_ylabel("Depth of EarthQuakes in km")

plt.show()