#include <stdio.h>
int romanChar2int(char roman);
int main(int argc, char** argv)
{
	int result = 0;
	int buffer = 0;
	if (argc != 2)
		return 0;
	while (*argv[1])
	{
		buffer += romanChar2int(*argv[1]);
		if ((romanChar2int(argv[1][0]) < romanChar2int(argv[1][1]))) 
		{
			result -= buffer;
			buffer = 0;
		}
		argv[1]++;
	}
	result += buffer;
	printf("result = %i\n", result);
	return 0;
}

int romanChar2int(char roman)
{		
	int number;
	switch(roman) {
	      case 'I' :
		 number = 1;
		 break;
	      case 'V' :
		 number = 5;
		 break;
	      case 'X' :
		 number = 10;
		 break;
	      case 'L' :
		 number = 50;
		 break;
	      case 'C' :
		 number = 100;
		 break;
	      case 'D' :
		 number = 500;
		 break;
	      case 'M' :
		 number = 1000;
		 break;
	      case '\0' :
		 number = 0;
		 break;
	      default :
		 printf("Invalid roman char: %c\n", roman);
	}
	return number;
}

