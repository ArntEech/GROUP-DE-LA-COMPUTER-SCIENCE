import 'dart:math';
import 'dart:io';

void main() {
  // Prompt the user to input a list of names separated by commas
  print("Enter a list of names separated by commas (e.g., Cyril, Joe, Sonny):");
  String input = stdin.readLineSync()!.trim();

  // Split the input string into a list of names
  List<String> names = input.split(',').map((name) => name.trim()).toList();

  // Generate a random index based on the length of the list
  int randomIndex = Random().nextInt(names.length);

  // Select the random name
  String selectedName = names[randomIndex];

  // Print the result
  print("$selectedName is going to buy the meal today!");
}
