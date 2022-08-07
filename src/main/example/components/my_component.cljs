(ns example.components.my-component
  (:require ["react-native" :as rn]
            ["tailwind-rn" :as tailwind]))

(defn text [text]
  (let [tw tailwind/useTailwind]
  [:> rn/View (:style (tw "flex-1 bg-red-500"))
   [:> rn/Text text]]))