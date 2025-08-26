(defn total-amount
  "Calculates total amount including penalty"
  [amount]
  (let [penalty-rate 0.1
        penalty-amount (* amount penalty-rate)]
    (+ amount penalty-amount)))

(def original-amount 1000.0)
(def final-amount (total-amount original-amount))
(println "Total amount including penalty:" final-amount)