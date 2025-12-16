Hi there! Im not super familar with using github so I had to watch a lot of videos how to work this so I hope everything is up to standard! 
I enjoyed this semester with the professor even If my grades werent the greatest to show it but I'm hoping to pass with a C!

This project is a simple Java-based e-commerce prototype created for my class final.
It demonstrates object-oriented programming, inheritance, lambda expressions, and streams.
The system allows users to browse products, adds them to a cart, and calculate order totals!!
Enjoy my work and my comments!


 E-Commerce Platform Prototype

This is a simple Java project I made for an assignment.
It’s basically a small e-commerce prototype to practice OOP,
inheritance, lambdas, and streams.

You can create different types of products, add them to a cart,
and calculate totals with tax and shipping!!

Stuff it can do:D
- Different product types (electronics, clothing, grocery)
- Customer and admin users
- Add products to a cart
- Calculate subtotal, tax, shipping, and final total
- Search and sort products and orders using streams!!!

Methods (what they do exactly?)

addToCart()==========================
Adds a product to the cart. I made this a method so cart logic
is handled in one place instead of everywhere.

getSubtotal()===========================
Adds up all the prices in the cart. I used a stream because
it’s easier than looping.

getTotalWithTax()===========================
Takes the subtotal and adds tax. Uses a lambda so the tax
rate is easy to change.

getShippingCost()================================
Figures out shipping based on how many items are in the cart.
If there are enough items, shipping is free.

getFinalTotal()===================================
Just combines everything to get the final price.

getCategory() / getRole()===============================
These are overridden in subclasses to return the product
category or user role.
