import CandidateList from './components/candidateList';
import CandidateInfo from './components/candidateInfo';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { useState } from 'react'


function App() {
  const [sharedName, setSharedName] = useState('');
  const [sharedAdjudication, setSharedAdjudication] = useState('ENGAGE');
  return (
    <BrowserRouter>
      <Routes>
        <Route
          path='/'
          element={
            <CandidateList
              setSharedName={setSharedName} />
          } />
        <Route
          path='/candidateInfo'
          element={
            <CandidateInfo
              sharedName={sharedName}
              sharedAdjudication={sharedAdjudication}
              setSharedAdjudication={setSharedAdjudication} />
          } />
      </Routes>
    </BrowserRouter>
  );
}

export default App;

