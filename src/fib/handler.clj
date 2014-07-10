(ns fib.handler
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.params :as mp]
            [org.httpkit.server :as httpkit]))

(defn- ^long fib [^long n]
  (case n
    0 0
    1 1
    (+ (fib (- n 1)) (fib (- n 2)))))

(defroutes app-routes
  (GET "/:number" {{number :number} :params}
       {:status 200 :header {"Content-Type" "text/plain"} :body (str (fib (Integer/parseInt number)))}))

(def app
  (mp/wrap-params app-routes))

(defn -main [port]
  (httpkit/run-server app {:port (Integer. port)}))
