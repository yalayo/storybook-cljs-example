(ns com.rondonsarnik.app.views
  (:require [reagent.core  :as r]
            ["/Button" :as button]))

(def button-component (r/adapt-react-class button))

(defn app
  []
  [:<>
   [:p "Footer -"]
   [button-component]])