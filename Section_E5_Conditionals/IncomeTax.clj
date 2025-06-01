(defn income-tax?
  [salary]
  (let [TAX-FIRST-BAND 0
        TAX-SECOND-BAND 0.1
        TAX-THIRD-BAND 0.2]
    (cond
      (<= salary 1000) (* salary TAX-FIRST-BAND)
      (<= salary 2000) (* salary TAX-SECOND-BAND)
      :else            (* salary TAX-THIRD-BAND))))

(println (format "%.2f" (income-tax? 1500.00)))
