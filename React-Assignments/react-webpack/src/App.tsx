import './style.css'
import IMAGE from './react.png'
import { ClickCounter } from './ClickCounter'

export const App = () => {
  return (
    <>
      <h1>
        Edited React TypeScript Webpack Starter Template -{' '}
        {process.env.NODE_ENV} {process.env.name}
      </h1>
      <img src={IMAGE} alt="React Logo" width="300" height="300" />
      <ClickCounter />
    </>
  )
}
