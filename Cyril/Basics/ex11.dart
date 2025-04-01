import 'dart:io';

void main() {
  print("Welcome to Papa's Pizza!");

  // Get pizza size
  stdout.write("What size pizza do you want? S, M, or L: ");
  String size = stdin.readLineSync()!.toUpperCase();

  // Get pepperoni choice
  stdout.write("Do you want pepperoni? Y or N: ");
  String pepperoni = stdin.readLineSync()!.toUpperCase();

  // Get extra cheese choice
  stdout.write("Do you want extra cheese? Y or N: ");
  String cheese = stdin.readLineSync()!.toUpperCase();

  // Set base prices
  int bill = 0;
  if (size == 'S') {
    bill = 15;
    if (pepperoni == 'Y') bill += 2;
  } else if (size == 'M') {
    bill = 20;
    if (pepperoni == 'Y') bill += 3;
  } else if (size == 'L') {
    bill = 25;
    if (pepperoni == 'Y') bill += 3;
  }

  // Extra cheese cost
  if (cheese == 'Y') bill += 1;

  // Display final bill
  print("Your final bill is: \$${bill}");
}
