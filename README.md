# Assignment 1 — Builder Pattern Implementation

## Overview
This project demonstrates the Builder creational pattern implemented in Java JDK 17 for a Pizza ordering system.

## Structure
- `Pizza`: Product class representing complex objects.
- `PizzaBuilder`: Interface for step-by-step construction.
- `ItalianPizzaBuilder` & `VeganPizzaBuilder`: Concrete builders with custom behavior and validation.
- `PizzaDirector`: Controls standardized builds (e.g., Pepperoni).
- `Main`: Client entry point.

## Execution
Run `pizza.Main` to see builder outputs in the console.
