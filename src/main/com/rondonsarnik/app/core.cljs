(ns com.rondonsarnik.app.core
  (:require ["react-dom/client" :as rdom]
            [reagent.core  :as r]
            [com.rondonsarnik.app.views :as views]))

(defn ^:export init []
  (let [root (rdom/createRoot (js/document.getElementById "app"))]
    (.render root (r/as-element [views/app]))))