import 'dart:io';

void main() {
  // Get user input for the year
  stdout.write("Enter a year: ");
  int year = int.parse(stdin.readLineSync()!);

  // Check leap year conditions
  if (year % 4 == 0) {
    if (year % 100 == 0) {
      if (year % 400 == 0) {
        print("Leap year.");
      } else {
        print("Not a leap year.");
      }
    } else {
      print("Leap year.");
    }
  } else {
    print("Not a leap year.");
  }
}
