import { test, expect } from "vitest"
import { sum, difference } from "./math"


test("test sum", () => {
  expect(sum(1, 2)).toBe(3)
})

test("test difference", () => {
  expect(difference(1, 2)).toBe(-1)
})