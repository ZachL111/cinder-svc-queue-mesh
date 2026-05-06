# cinder-svc-queue-mesh

`cinder-svc-queue-mesh` keeps a focused Kotlin implementation around backend services. The project goal is to design a Kotlin verification harness for queue systems, covering storage recovery, log and snapshot fixtures, and failure-oriented tests.

## Use Case

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Cinder Svc Queue Mesh Review Notes

For a quick review, compare `worker slack` with `session drift` before reading the middle cases.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/cinder-svc-queue-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `worker slack` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Kotlin implementation avoids hidden state so fixture changes are easy to reason about.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The check exercises the source code and the review fixture. `edge` is the high score at 245; `recovery` is the low score at 168.

## Future Work

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
