(ns example.components.my-component
  (:require ["react-native" :as rn]
            ["tailwind-rn" :as tailwind]))

(defn text [text]
  (let [tw tailwind/useTailwind]
  [:> rn/View (:style (tw "flex-1"))
   [:> rn/Text text]]))