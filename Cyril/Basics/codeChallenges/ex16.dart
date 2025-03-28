import 'dart:io';

void main() {
  stdout.write("Enter your list of heights (separated by a space): ");
  List<String> inputHeights = stdin.readLineSync()!.split(' ');

  List<int> studentHeights = [];
  for (var height in inputHeights) {
    studentHeights.add(int.parse(height));
  }

  int totalHeight = 0;
  int numStudents = 0;

  for (var height in studentHeights) {
    totalHeight += height;
    numStudents++;
  }

  int averageHeight = (totalHeight / numStudents).round();

  print(averageHeight);
}
