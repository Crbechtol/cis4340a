boolean validFlag = false;
do {
  try {
    //...
    // If requested file does not exist, throws FileNotFoundException
    // If requested file exists, sets validFlag to true
    validFlag = true;
  } catch (FileNotFoundException e) {
    // Ask user for different file name
  }
} while (validFlag != true);
// Use file
