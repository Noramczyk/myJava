int temp = x;
int rev = 0;

while(temp != 0)
{
  rev = (rev * 10) + (temp%10);
  temp = temp/10;
}

// rev is what were looking for

TEMP
int i = 5;
int j = 9;
int temp = 0;

temp = i + j;  // 5 + 9
j = temp - i;  // 14 - 5
i = temp - j;  // 14 - 9
