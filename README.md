<h1 align="center"> Mandelbrot Set Visual Representation </h1>
Code written in java that takes the real/imaginary part of the complex numbers in the mandelbrot set and plots them on the screen as x and y values


## Overview

This was a homework assignment for my algorithms class but I decided to put it up here because I thought it was really cool.

The mandelbrot set is a specific set of complex numbers which has a really really convoluted fractal boundarr when plotted.

This means that if you zoom in, the patterns keep changing little by little and the fractal you're looking at looks completly new each time until eventually it loops. 


Our assignment was to create a class that represents complex numbers and then make a class called mandelbrot that pretty much just checks to see if the number is in the set.

All we then have to do is plot the point on the screen using Canvas if it is in the mandelbrot set and boom, you have your represenation


I decided to spice things up however though, so I added a color scheme to mine so it looked cooler

<img align="center" src="https://i.imgur.com/nZAaSVF.jpg">





## Usage

If you want to zoom in/change the color/perform other commands, I suggest you do it with the command line support I implemented instead of manually changing the code yourself.

In order to do this, navigate to the folder (using the command line) that contains all the files you downloaded from this repo, and first type in:

```shell
javac Homework_4.java
```

to compile the runner file.

For the commands the syntax is as follows:

```shell
java Homework_4 -setting value
```

for example if I wanted to change the height of the screen to 1080, I would type in

```shell
java Homework_4 -height 1080
```

Here's a full list of supported command line arguments:

<img src="https://i.imgur.com/JXht7EE.jpg">
