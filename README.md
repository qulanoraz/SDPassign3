# SDPassign3

"Adapter" pattern helps connect two classes with different interfaces, so they can work together without changing their code.

What My Code Does:

I have an interface called Degree with a method getCelsius(). This is what my program expects.
There is an old class called LegacyDegree that only has getFahrenheit(). It returns temperature in Fahrenheit, not Celsius.
I wrote an adapter class called DegreeAdapter. It takes a LegacyDegree object and converts Fahrenheit to Celsius inside the getCelsius() method.
In my Main class, I use the adapter. I create a Degree object using DegreeAdapter and print the temperature in Celsius.

Why I Used Adapter Pattern:

The adapter lets me use old code (LegacyDegree) without changing it.
My program can work with Celsius, even if the old class only gives Fahrenheit.
This is useful when you have legacy code or third-party libraries that you cannot change.

How It Works (Step by Step):

The client (Main) asks for Celsius temperature using getCelsius().
The adapter (DegreeAdapter) gets Fahrenheit from LegacyDegree and converts it to Celsius.
The client gets the result in Celsius, and does not need to know about Fahrenheit or the old class.

In summary: My project shows how the Adapter Pattern helps different classes work together. I used it to convert temperature from Fahrenheit to Celsius, making my program flexible and easy to update.
