
  
#include <iostream> 
#include <pngwriter.h> 
#include <string> 
  

void generate_PNG(int const width, 
                  int const height, 
                  std::string filepath) 
{ 
  
    cout << endl 
         << "Filepath: "
         << filepath.c_str(); 
  
    
    pngwriter flag{ width, height, 0, 
                    filepath.data() }; 
  
  
    int const size = width / 3; 
  
    
    flag.filledsquare(0, 0, size, 
                      2 * size, 0, 
                      0, 65535); 
  
    flag.filledsquare(size, 0, 2 * size, 
                      2 * size, 0, 
                      65535, 65535); 
  
    flag.filledsquare(2 * size, 0, 
                      3 * size, 2 * size, 
                      65535, 0, 65535); 
  
     
    flag.close(); 
} 
  

int main() 
{ 
    
    int width = 300, height = 200; 
  
    
    std::string filepath; 
   
    generate_PNG(width, height, filepath); 
  
    return 0; 
} 