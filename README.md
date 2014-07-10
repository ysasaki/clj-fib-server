# fib

Fibonacci(10) Calculation per Request by Clojure  
[http://blog.vitamin11.org/2014/07/clojurefibonacci10-calculation-per.html](http://blog.vitamin11.org/2014/07/clojurefibonacci10-calculation-per.html)

## Prerequisites

You will need [Leiningen][1] 2.3.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein uberjar
    java -jar target/fib-0.1.0-SNAPSHOT-standalone.jar 5000

## License

Copyright © 2014 Yoshihiro Sasaki
