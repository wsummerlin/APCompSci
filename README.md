AP Computer Science Sample Lab Code
=========

Java repository comprised of common lab problems in an AP Computer Science curriculum 

I'm an experienced programmer and developed all of these examples with a balance of efficiency and readability. Feel free to use any code you find helpful. All my methodology practices are pretty standard. 

Note - Some files import the apcslib.jar library. It can be found here: http://pavao.org/compsci/apcs/apcslib.jar (It will download when you click the link...it shouldn't take you to another page)

To use: create a java project, import apcslib.jar, then create a class within the project with the SAME name as the file (example: drawBenzine). Copy and paste the code - you're good to go. 

Contact me with any questions!! techpulsesoftware@gmail.com

Descriptions:
=========

  BuildClass - A cool program that draws a house and changes the color and size of the sun based on the current temperature. The sky color also changes based on some weather data. It interacts with the foracast.io api. It's dependant on the foracastio library. You can get that here: https://github.com/dvdme/forecastio-lib-java. You just need to add the forecastio-lib-java.jar to your project when it's created. 
  
  drawBenzine - A basic program that will draw a hexagon and then a circle in the hexagon (it's supposed to look like benzine). It has a good while loop example and efficient manor of creating the hexagon.
  
  DayOf - An algorithm for calculating the day and month of Easter in the Gregorian calendar. Simply set the int y to the year you want to get the values for and run. For example if you set:
```int y = 2003;``` the value ```4/20``` would be printed to the console (along with the value of every object).

  changeCalc - Simple algorithm to calculate the number of coins in any given dollar amount. The program calculates the results based on change, so to enter values $1 or greater without a decimal point (multiply the desired value by 100). For example $0.90 would be entered as ```90``` and $2.94 would be entered as ```294```. 
  
  
Dependencies 
=========

  BuildClass - apcslib.jar AND forecastio-lib-java.jar (https://github.com/dvdme/forecastio-lib-java)
  
  drawBenzine - apcslib.jar 
  
  DayOf - None
  
  changeCalc - None


Licence:
=========

Copyright © 2015 Will Summerlin

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


