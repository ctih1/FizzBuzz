fn fizz_buzz(n: i32) {
    for i in 1..n {
        if i%3==0 && i%5==0 {
            print!("FizzBuzz\n");
        }
        else if i%3==0 {
            print!("Fizz\n");
        }
        else if i%5==0 {
            print!("Buzz\n");
        }
        else {
            print!("{}\n",i);
        }
    }
}

fn main() {
    fizz_buzz(100);
}

