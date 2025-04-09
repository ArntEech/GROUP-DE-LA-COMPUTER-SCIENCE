import 'dart:io';

void main() {
  print("Welcome to the Band Name Generator!\n");

  stdout.write("What's the name of the city you grew up in?\n");
  String city = stdin.readLineSync() ?? "";

  stdout.write("What's your pet's name?\n");
  String pet = stdin.readLineSync() ?? "";

  print("\nYour band name could be: $city $pet");
}
