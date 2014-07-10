(defproject fib "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]
                 [http-kit "2.1.16"]]
  :plugins [[lein-ring "0.8.11"]]
  :main fib.handler
  :aot :all
  :ring {:handler fib.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
