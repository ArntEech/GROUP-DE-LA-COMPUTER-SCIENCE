import 'dart:io';

void main() {
  stdout.write("Height of wall: ");
  int test_h = int.parse(stdin.readLineSync()!);

  stdout.write('Width of wall: ');
  int test_w = int.parse(stdin.readLineSync()!);

  int coverage = 5;

  var result = paint_calc(test_h, test_w, coverage);

  print("You'll need ${result} cans of paint");
}

dynamic paint_calc(height, width, coverage) {
  double numberOfCans = ((height * width) / coverage);
  numberOfCans.round();
  return numberOfCans.toInt();
}
