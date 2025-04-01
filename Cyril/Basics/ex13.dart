import 'dart:math';

void main() {
  // Generate a random number: 0 or 1
  int randomNumber = Random().nextInt(2);

  // Use the random number to determine Heads or Tails
  String result = (randomNumber == 0) ? 'Heads' : 'Tails';

  // Print the result
  print(result);
}
