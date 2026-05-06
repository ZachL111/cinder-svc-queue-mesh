# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 201, lane `ship`
- `stress`: `retry load`, score 202, lane `ship`
- `edge`: `worker slack`, score 245, lane `ship`
- `recovery`: `session drift`, score 168, lane `ship`
- `stale`: `queue pressure`, score 190, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
