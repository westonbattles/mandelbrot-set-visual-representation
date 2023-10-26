<h1 align="center"> Mandelbrot Set Visual Representation </h1>
Code written in java that takes the real/imaginary part of the complex numbers in the mandelbrot set and plots them on the screen as x and y values


## Overview

This was a homework assignment for my Algorithms class but I decided to put it up here because I thought it was really cool.

The Mandelbrot set is a unique collection of complex numbers producing an intricate fractal boundary when visualized. This results in a fascinating property; as you zoom in, the patterns undergo subtle transformations, revealing new and equally amazing designs.

The task of visual represntation involved creating a class to represent complex numbers, followed by developing a 'Mandelbrot' class responsible for determining whether a given number belongs to the Mandelbrot set. Upon verifying a number’s membership in the set, the next step was to represent it visually on the screen using the Canvas tool.

I then incorporated a b&w color scheme to enrich the visual experience, adding an extra layer of aesthetic complexity.

<img align="center" src="https://i.imgur.com/nZAaSVF.jpg">





## Usage

If you want to zoom in/change the color/perform other commands, I suggest you do it with the command line support I implemented instead of manually changing the code yourself.

In order to do this, navigate to the folder (using the command line) that contains all the files you downloaded from this repo, and first type in:

```shell
javac Homework_4.java
```

to compile the runner file.

The syntax is as follows:

```shell
java Homework_4 -setting value
```

for example if I wanted to change the height of the screen to 1080, I would type in

```shell
java Homework_4 -height 1080
```

Here's a full list of supported command line arguments:

<img src="https://i.imgur.com/JXht7EE.jpg">
