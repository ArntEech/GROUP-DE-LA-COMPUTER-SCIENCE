function isLeap(year){
    if (year % 4 === 0){
        if (year % 100 === 0){
            if (year % 400 === 0){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    } else {
        return false;}
    }

function daysInMonth(year, month){
  monthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

  if (isLeap(year)===true){
    monthDays[1]+=1;}
  return monthDays[month-1];
}

console.log(`The number of days is ${daysInMonth(2022,2)}`);
