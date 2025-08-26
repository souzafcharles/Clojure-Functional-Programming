;; Define a pure function to calculate the total value of investments
(defn calculate-total-investment [investments]
  (reduce + investments))

;; Example input (list of investment values)
(def investment-values [100.0 250.5 349.9])

;; Calculate the total
(def total (calculate-total-investment investment-values))

;; Output the result
(println "Total investment value:" total)