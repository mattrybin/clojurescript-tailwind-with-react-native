(ns example.app
  (:require [example.events]
            [example.subs]
            [expo.root :as expo-root]
            [re-frame.core :as rf]
            ["react-native" :as rn]
            ["tailwind-rn" :as tailwind]
            [example.components.my-component :refer [text]]
            [reagent.core :as r]))

(def tailwind-json (js/require "../tailwind.json"))

(js/console.log tailwind-json)

(defn root []
  [:> tailwind/TailwindProvider {:utilities tailwind-json}
   [:> rn/View {:style {:flex 1
                        :padding-vertical 50
                        :justify-content :center
                        :align-items :center
                        :background-color :white}}
    [:> rn/Text "Make tailwind work"]
    [:f> text "hello"]]])

(defn start
  {:dev/after-load true}
  []
  (expo-root/render-root (r/as-element [root])))

(defn init []
  (rf/dispatch-sync [:initialize-db])
  (start))