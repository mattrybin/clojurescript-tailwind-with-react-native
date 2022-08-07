(ns example.components.my-component
  (:require ["react-native" :as rn]
            ["tailwind-rn" :as tailwind]))

(defn text [text]
  (let [tw tailwind/useTailwind]
  (js/console.log (tw "mt-12"))
  [:> rn/View (:style (tw "flex-1 mt-12 pb-12 bg-red-500"))
   [:> rn/Text "hello"]]))