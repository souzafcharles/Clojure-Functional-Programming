(ns traning-clojure-codes.core
  (:gen-class))

(defn delivery-fee [value] 
  (cond
    (not (number? value)) 
    (throw (IllegalArgumentException. "The value must be a number."))
    (neg? value) 
    (throw (IllegalArgumentException. "The value cannot be negative."))
    (<= value 100) 
      15
    (and (> value 100) (<= value 200)) 
      5
    :else 0))
