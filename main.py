"""
Fizz buzz is a group word game for children to teach them about division. Players take turns to count incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz", and any number divisible by both 3 and 5 with the word "fizzbuzz".
"""
def main():
    FizzBuzz(100)


def FizzBuzz(n: int):
    for i in range(n):
        if i%3==0 and i%5==0:
            print("FizzBuzz")
        elif i%3 == 0:
            print("Fizz")
        elif i%5 == 0:
            print("Buzz")
        else:
            print(i)
    
if __name__ == '__main__':
    main()